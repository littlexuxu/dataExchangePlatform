
(function($) {
	$.fn.serializeJson = function() {
		var serializeObj = {};
		$(this.serializeArray()).each(function() {
			serializeObj[(this.name).split(".")[1]] = this.value;
		});
		return serializeObj;
	};
	$.fn.serializeJsonContain = function(nameattr) {
		debugger;
		var serializeObj = {};
		$(this.serializeArray()).each(function() {
			if(this.name.indexOf(nameattr)>= 0)
				serializeObj[(this.name).split(".")[1]] = this.value;
		});
		return serializeObj;
	};
})(jQuery);



function joinformatter(value, row, index) {
	try {
		var name = this.field + 'name';
		if (row[name])
			return row[name];
		else
			return value;
	} catch (e) {
		return value;
	}
}
