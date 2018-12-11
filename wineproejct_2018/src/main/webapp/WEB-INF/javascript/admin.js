function deleteUser(userId, loginId) {

	if (confirm(loginId + "님을 삭제하시겠습니까?")) {
		var information = {
			'userId' : userId

		}
		$.ajax({
			url : 'admindeleteUser.do',
			type : 'POST',
			data : information,
			error : function(error) {
				console.log(error);
			},
			success : function() {
				alert(loginId + "님을 삭제하였습니다.")
				location.href = "adminUserList.do";
			}

		})
	} else {
		return false;
	}
}

function deleteMatchFood(matchFoodId, matchFoodName, img) {
	if (confirm(matchFoodName + "을 삭제하시겠습니까?")) {
		var information = {
			'matchFoodId' : matchFoodId,
			'img' : img
		}
		$.ajax({
			url : 'deleteMatchFood.do',
			type : 'post',
			data : information,
			error : function(error) {
				console.log(error);
			},
			success : function() {
				alert('제품을 삭제하였습니다.')
				location.href = "adminProductList.do"
			}
		})
	} else {
		return false;
	}
}

$(function() {
	$("#nation").val($('#compareNation').val()).prop("selected", true);

	$("#wineImg").val($('#compareWine').val()).prop("selected", true);
})
function updateMatchFood() {
	if (confirm("상품을 등록하시겠습니까?")) {
		if ($('#matchFoodName').val() == "") {
			alert('제품 명을 입력해주세요!');
			$('#matchFoodName').focus();
			return false;
		} else if ($('#price').val() == "") {
			alert('가격을 입력해주세요!');
			$('#price').focus();
			return false;
		} else if ($('#weight').val() == "") {
			alert('중량을 입력해주세요!');
			$('#weight').focus();
			return false;
		} else if ($('#ex').val() == "") {
			alert('제품 설명을 입력해주세요!');
			$('#ex').focus();
			return false;
		} else if ($('#compareName').val() != $('#matchFoodName').val()) {
			if (document.getElementById('NoHave').innerHTML == '상품 중복 검사를 해주세요') {
				alert('중복 검사를 해주세요!');
				return false
			} else if (document.getElementById('NoHave').innerHTML == '등록된 상품이 있습니다') {
				alert('상품이 중복됩니다.');
				return false;
			} else {
				var form = $('#frm')[0];
				var formData = new FormData(form);
				$
						.ajax({
							url : 'updateMatchFood.do',
							type : 'post',
							data : formData,
							enctype : 'multipart/form-data',
							processData : false,
							contentType : false,
							error : function(error) {
								console.log(error);
							},
							success : function(result) {
								if (result == "Y") {
									alert("상품 수정에 성공했습니다.");
									location.href = "adminmatchFoodView.do?matchFoodId="
											+ $('#matchfoodId').val();
								} else {
									alert("상품 수정에 실패했습니다.")
									return false;
								}
							}

						})

			}

		} else {
			var form = $('#frm')[0];
			var formData = new FormData(form);
			$.ajax({
				url : 'updateMatchFood.do',
				type : 'post',
				data : formData,
				enctype : 'multipart/form-data',
				processData : false,
				contentType : false,
				error : function(error) {
					console.log(error);
				},
				success : function(result) {
					if (result == "Y") {
						alert("상품 수정에 성공했습니다.");
						location.href = "adminmatchFoodView.do?matchFoodId="
								+ $('#matchfoodId').val();
					} else {
						alert("상품 수정에 실패했습니다.")
						return false;
					}
				}

			})
		}

	}
}

function hasMatchFoodName() {
	if ($('#matchFoodName').val() == "") {
		alert("중복을 검사할 음식명을 입력해주세요");
		return false;
	} else {
		var information = {
			'matchFoodName' : $('#matchFoodName').val()
		}
		$
				.ajax({
					url : 'hasMatchFood.do',
					type : 'post',
					data : information,
					error : function(error) {
						console.log(error);
					},
					success : function(result) {
						if (result == "Y") {
							alert("등록된 상품이 있습니다.");
							document.getElementById('NoHave').innerHTML = "등록된 상품이 있습니다";
						} else {
							alert("등록 가능한 상품 입니다.");
							document.getElementById('NoHave').innerHTML = "등록이 가능한 상품입니다";
						}
					}

				})
	}
	;
}

$(function() {
	$('#user').click(function() {
		$('.user-list').css('display', 'block')
		$('.product-list').css('display', 'none')
		$('.review-list').css('display', 'none')
		$('.payment-list').css('display', 'none')
	})
	$('#product').click(function() {
		$('.user-list').css('display', 'none')
		$('.product-list').css('display', 'block')
		$('.review-list').css('display', 'none')
		$('.payment-list').css('display', 'none')
	})
	$('#review').click(function() {
		$('.user-list').css('display', 'none')
		$('.product-list').css('display', 'none')
		$('.review-list').css('display', 'block')
		$('.payment-list').css('display', 'none')
	})
	$('#payment').click(function() {
		$('.user-list').css('display', 'none')
		$('.product-list').css('display', 'none')
		$('.review-list').css('display', 'none')
		$('.payment-list').css('display', 'block')
	})
})

function findNation() {
	$('.nation option[value=' + $('#search').val() + ']').attr('selected',
			'selected');
};