/*!
 * 
*/

function eventHideOrShowDiv(idElement, isHide) {
	console.log(idElement + isHide);
	if (isHide === 'false') {
		$('#'+idElement).hide();
		$('#theDem').hide();
		$('#divButton').show();
	} else if (isHide === 'true') { 
		$('#'+idElement).show();
		$('#theDem').show();
		$('#divButton').hide();
	}
};

function randomNumber(idElement) {
	var d = new Date();
	var n = d.getTime();
	$('#'+idElement).val(n);
};