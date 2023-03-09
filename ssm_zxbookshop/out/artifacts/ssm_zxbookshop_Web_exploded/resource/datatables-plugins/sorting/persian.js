/**
 * Sorting in Javascript can be difficult to get right with non-Roman 
 * characters - for which special consideration must be made. This plug-in 
 * performs correct sorting on Persian characters.
 *
 *  @name Persian
 *  @summary Sort Persian strings alphabetically
 *  @author [Afshin Mehrabani](http://www.afshinblog.com/)
 *
 *  @example
 *    $('#example').dataTable( {
 *       columnDefs: [
 *         { type: 'pstring', targets: 0 }
 *       ]
 *    } );
 */

(function(){

var persianSort = [ '丌', '丕', '亘', '倬', '鬲', '孬', '噩', '趩', '丨', '禺', '丿', '匕', '乇', '夭', '跇',
					'爻', '卮', '氐', '胤', '馗', '毓', '睾', '賮', '賯', '讴', '诏', '賱', '賲', '賳', '賵', '賴', '蹖', '賷' ];

function GetUniCode(source) {
	source = $.trim(source);
	var result = '';
	var i, index;
	for (i = 0; i < source.length; i++) {
		//Check and fix IE indexOf bug
		if (!Array.indexOf) {
			index = jQuery.inArray(source.charAt(i), persianSort);
		}else{
			index = persianSort.indexOf(source.charAt(i));
		}
		if (index < 0) {
			index = source.charCodeAt(i);
		}
		if (index < 10) {
			index = '0' + index;
		}
		result += '00' + index;
	}
	return 'a' + result;
}

jQuery.extend( jQuery.fn.dataTableExt.oSort, {
	"pstring-pre": function ( a ) {
		return GetUniCode(a.toLowerCase());
	},

	"pstring-asc": function ( a, b ) {
		return ((a < b) ? -1 : ((a > b) ? 1 : 0));
	},

	"pstring-desc": function ( a, b ) {
		return ((a < b) ? 1 : ((a > b) ? -1 : 0));
	}
} );

}());
