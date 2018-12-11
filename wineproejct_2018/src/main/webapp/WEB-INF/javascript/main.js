$(function(){
    $('li:contains("Login")').mouseover(function(){
        $('.login-box').css('display', 'block');
    })
    $('li:contains("Login")').mouseleave(function(){
        $('.login-box').css('display', 'none');
    })

    $("#category").mouseover(function(){
        $('.category-dropdown').css('display', 'block');
    })
    $("#category").mouseleave(function(){
        $('.category-dropdown').css('display', 'none');
    })
    $("#category").mouseleave(function(){
        $('.nation-ul').css('display', 'none');
    })
    $("#category").mouseleave(function(){
        $('.type-ul').css('display', 'none');
    })
    $("#category").mouseleave(function(){
        $('.price-ul').css('display', 'none');
    })

    $("#nation").mouseover(function(){
        $('.nation-ul').css('display', 'block');
        $('.type-ul').css('display', 'none');
        $('.price-ul').css('display', 'none');
    })
    $(".nation-ul").mouseover(function(){
        $('.nation-ul').css('display', 'block');
    })
    $(".nation-ul").mouseleave(function(){
        $('.nation-ul').css('display', 'none');
    })


    $("#type").mouseover(function(){
        $('.type-ul').css('display', 'block');
        $('.nation-ul').css('display', 'none');
        $('.price-ul').css('display', 'none');
    })
    $(".type-ul").mouseover(function(){
        $('.type-ul').css('display', 'block');
    })



    $("#price").mouseover(function(){
        $('.price-ul').css('display', 'block');
        $('.nation-ul').css('display', 'none');
        $('.type-ul').css('display', 'none');
    })
    $("#price-ul").mouseover(function(){
        $('.price-ul').css('display', 'block');
    })
});