function get(){
    //alert("helo");
    var item={
        "email":document.getElementById("uname").value
    }
    console.log(item);
    $.ajax({
    type: "GET",
    url: "http://localhost:9090/list",
    data: JSON.stringify(item),
    success: function (result) {
        //getAll();
        console.log("sucesss");
        console.log(result);
       // location.href="home.html";
        getnew();
    },
    error: function (result) {
        alert("msg");
    },
});
}
function getnew(){
    alert("hai");
    location.href="home.html";
}