

//기본 Ajax 처리 메소드 - BlockUi 미사용
function ajaxCallNoBlock(url, params, sucessFun, errorFun, async) {
	if (async == undefined) async = true;
	$.ajax({
		cache : false,
		type : "POST",
		url : url,
		data : params,
		async : async,
		dataType : 'json',
		contentType : "application/x-www-form-urlencoded; charset=UTF-8", // AJAX contentType
		success : function(data) {
			if (data.resultCode != undefined && data.resultCode == '401') {
				alert(data.resultMsg);
				if (data.resultCode == '401') location.href = "/";//세션정보가 없을경우
				return;
			}
			if (data.resultMsg != undefined && data.resultMsg != '') {
				alert(data.resultMsg);
			}
			if (typeof (sucessFun) == 'function')
				sucessFun(data);
		},
		error : function(xhr, status, error) {
			alert("시스템 오류가 발생하였습니다." + error);
			if (typeof (errorFun) == 'function') errorFun();
			return;
		}
	});
}