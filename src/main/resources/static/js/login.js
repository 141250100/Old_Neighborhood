/**
 * Created by st0001 on 2017/12/14.
 * 进行表单内容的基本验证——不符合反馈
 * 进行表单内容的读取发送至~~
 * 注册跳转到另外的页面
 */
$().ready(function() {
    $("#login_form").validate({
        rules: {
            username:"required",
            password: {
                required: true,
                minlength: 5
            }
        },
        messages: {
            username: "请输入姓名",
            password: {
                required: "请输入密码",
                minlength: "密码不能小于{0}个字符"
            },
        }
    });
    $("#login").click(function(){
    	var name=$("#exampleInputEmail1").val();
    	var passwd=$("#exampleInputPassword1").val();
    	var type=$(':radio:checked').val();
//    	alert(type);
    	
    	var httpurl = "/login";
  
    	
    	$.ajax({
            url: httpurl,
            type: 'post',
            contentType:'application/json',
            data:JSON.Stringify({
            	'username':name,
    			'password':passwd,
    			'role':type
            }), 
            success: function (data) {   //成功后回调
            	alert("登陆成功！");
                alert(data);
//                process(data);
              	//测试跳转
            	if (type=="student") {
            		window.location.href("studentIndex.html");
        		}else if (type=="teacher"){
        			window.location.href("adminindex.html");
        			
        			
        			//可以考虑JS之间的合并
        			
        			
        		}
            },
            error: function(e){    //失败后回调
            	
                alert("出错了");
            },
            beforeSend: function(){  //发送请求前调用，可以放一些"正在加载"之类额话
                alert("正在加载......");
            },
            datatype: "json"
    	})
    
    })
    
});