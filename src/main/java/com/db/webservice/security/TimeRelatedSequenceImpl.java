package com.db.webservice.security;


import java.util.concurrent.atomic.AtomicLong;

public class TimeRelatedSequenceImpl extends AtomicLong
{
  private static final long serialVersionUID = 1L;
  static final int TIME_ZOOM_SHIFT = 24;
  private final int clusterIndex;

  static final int hash(long seq)
  {
    return (int)(seq >>> 28 ^ seq >>> 4);
  }

  public TimeRelatedSequenceImpl(int clusterIndex)
  {
    if ((clusterIndex < 0) || (31 < clusterIndex)) {
      throw new IllegalArgumentException("clusterIndex(" + clusterIndex + ") ������[0.." + 31 + "]��䷶Χ��!");
    }
    this.clusterIndex = clusterIndex;
    set(nextTimeFirst());
  }

  private final long nextTimeFirst() {
    return ((System.currentTimeMillis() & 0xFFFFFFE0) << 24) + this.clusterIndex;
  }

  public final long last() {
    return super.get();
  }
  public final long next() { long nextTimeFirst = nextTimeFirst();
    long last;
    long next;
    do {
      last = super.get();
      next = last + 32L;
      if (next < nextTimeFirst)
        next = nextTimeFirst;
    }
    while (!
      super.compareAndSet(last, next));
    return next; }

  public static final long timeOf(long seq)
  {
    long timePart = seq >>> 24 & 0xFFFFFFE0;
    if (timePart > 133905972224L) {
      return timePart + 1099511627776L;
    }
    return timePart + 2199023255552L;
  }
}