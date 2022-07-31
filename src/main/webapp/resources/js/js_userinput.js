$(function(){
	// 사용자의 자료 입력여부를 검사하는 함수
	$('#confirm').click(function(){
    	if( $.trim($("#userId").val()) == '' ){
            alert("아이디를 입력해 주세요.");
            $("#userId").focus();
            return;
        }
    	
    	if($.trim($('#userPass').val())==''){
    		alert("비번입력해주세요.");
    		$('#userPass').focus();
    		return;
    	}
    	
    	if($.trim($('#userPass').val()) != $.trim($('#userPass2').val())){
    		alert("비밀번호가 일치하지 않습니다..");
    		$('#userPass2').focus();
    		return;
    	}
    	
    	
    	if($.trim($('#userName').val())==''){
    		alert("이름입력해주세요.");
    		$('#userName').foucs();
    		return;
    	}
       
        // 자료를 전송합니다.
        document.userinput.submit();
	});
	
	//아이디 중복체크
	//*** 수업을 위해서 keyup 이벤트 처리
	// 추후에는 <아이디중복확인>버튼을 만들고 결과를 옆에 출력
   $('#icr').click(function(){
        $.ajax({
           type : 'post',
           url : 'idCheck.do',
           data : {userId : $('#userId').val()},
           contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
           success : function(result){
              alert(result);
           },
           error : function(err){
              alert('에러');
           }
        });
       
   });
   
   
//보드 리스트 가지고 오기
$(function(){
	$('input.aaa1').click(function(){

		
		$.ajax({
			type : 'post',
			url : 'board.do',
			dataType : 'json',
			success : function(result){				
		        $('#first').empty();			
				for(obj of result){					
					var templi = $('<li/>');
					templi.text(obj['gonziName']);
					$('#first').append(templi);					
				}},error : function(err){
				alert('ajax 통신 실패'+ err); //err이거는 주소값만 떠서 콘솔로 봐야됨
				console.log(err);
				}										
		});								
	});		
});
   

});
	
	
	
	
	
	
	
	