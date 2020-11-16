<script>
    //This is called after the DOM is fully loaded
$(function() {
   $("#login").click(function(evt){
       //Prevent the default submit
       evt.preventDefault();
       //call the submit funtion
      submitData();
   });
});

function submitData()
{
    var dataObj = new Object();
    dataObj.userName = $("#uid").val();
    dataObj.password = $("#password").val();
    console.log(dataObj);


    $.ajax({
    url : '/login',
    dataType : 'json',
    contentType : 'application/json; charset=UTF-8',
    type : 'POST',
    data: JSON.stringify(dataObj),
    beforeSend : function(){
        //do something before send (e.g. show a message like: please wait)
    });

    },
    complete   : function(){
        //do something after sent (e.g. remove the message please wait)
    },
    success : function(data) {
        //handle the success response
    },
    error : function(data) {
        //handle the error response
    }
    });
}
</script>