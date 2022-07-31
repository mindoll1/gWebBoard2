<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--방금 추가함   -->
<link rel="stylesheet" href="../resources/style/stylecss.css" type="text/css">
<script type="text/javascript" src="../resources/js/jquery-1.7.1.js"></script>
<script  src="../resources/js/js_userinput.js"></script>
<script type="text/javascript">



</script>
<!--위에꺼추가  -->
</head>
<body>
  <dl id="tabmenu">
     <dt class="tab_btn	tab_btn1">
        <input type="radio" class="aaa1" value="gogi" id="gongzi">공지사항
     </dt>
     
    <dd>
    	
       <ul id="first">        
       </ul>
       
     </dd>
    
   
     <dt class="tab_btn	tab_btn2">
        <input type="radio" class="aaa2" value="gogi" id="qna">질문과답변
     </dt>
     

	 <dt class="tab_btn	tab_btn3">
        <input type="radio" class="aaa3" value="gogi" id="author">저자문의
     </dt>

     
    </dl>
</body>
</html>