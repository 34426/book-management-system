/**
 * When search a table with accented characters, it can be frustrating to have
 * an input such as _Zurich_ not match _Z眉rich_ in the table (`u !== 眉`). This
 * type based search plug-in replaces the built-in string formatter in
 * DataTables with a function that will remove replace the accented characters
 * with their unaccented counterparts for fast and easy filtering.
 *
 * Note that with the accented characters being replaced, a search input using
 * accented characters will no longer match. The second example below shows
 * how the function can be used to remove accents from the search input as well,
 * to mitigate this problem.
 *
 *  @summary Replace accented characters with unaccented counterparts
 *  @name Accent neutralise
 *  @author Allan Jardine
 *
 *  @example
 *    $(document).ready(function() {
 *        $('#example').dataTable();
 *    } );
 *
 *  @example
 *    $(document).ready(function() {
 *        var table = $('#example').dataTable();
 *
 *        // Remove accented character from search input as well
 *        $('#myInput').keyup( function () {
 *          table
 *            .search(
 *              jQuery.fn.DataTable.ext.type.search.string( this )
 *            )
 *            .draw()
 *        } );
 *    } );
 */

jQuery.fn.DataTable.ext.type.search.string = function ( data ) {
    return ! data ?
        '' :
        typeof data === 'string' ?
            data
                .replace( /苇/g, '蔚')
                .replace( /蠉/g, '蠀')
                .replace( /蠈/g, '慰')
                .replace( /蠋/g, '蠅')
                .replace( /维/g, '伪')
                .replace( /委/g, '喂')
                .replace( /萎/g, '畏')
                .replace( /\n/g, ' ' )
                .replace( /谩/g, 'a' )
                .replace( /茅/g, 'e' )
                .replace( /铆/g, 'i' )
                .replace( /贸/g, 'o' )
                .replace( /煤/g, 'u' )
                .replace( /锚/g, 'e' )
                .replace( /卯/g, 'i' )
                .replace( /么/g, 'o' )
                .replace( /猫/g, 'e' )
                .replace( /茂/g, 'i' )
                .replace( /眉/g, 'u' )
                .replace( /莽/g, 'c' )
                .replace( /矛/g, 'i' ) :
            data;
};
