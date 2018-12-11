$(function(){
    $('#receipt').click(function(){
        $('.receipt').css('display', 'block');
        $('.review').css('display', 'none');
    })
    $('#receipt-close').click(function(){
        $('.receipt').css('display', 'none');
    })
    $('#review').click(function(){
        $('.review').css('display', 'block');
        $('.receipt').css('display', 'none');
    })
    $('#review-close').click(function(){
        $('.review').css('display', 'none');
    })
})