<#import "/resource/common_html_front.ftl" as html>
<#import "/indexMenu.ftl" as menu>

<@html.htmlBase title="模拟网关支付">
    <@menu.menu selectMenu=""/>
<h1> 模拟支付动作</h1>
<h3>待支付信息</h3>
<table class="table">
    <tr>
        <td>订单号:</td>
        <td>${payInfo.WIDout_trade_no!""}</td>
    </tr>
    <tr>
        <td>标题:</td>
        <td>${payInfo.WIDsubject!""}</td>
    </tr>
    <tr>
        <td>金额:</td>
        <td>${payInfo.WIDprice!""}</td>
    </tr>
    <tr>
        <td>配送费:</td>
        <td>${payInfo.logistics_fee!""}</td>
    </tr>
</table>
<div> <input id="btnPay" type="button" class="btn btn-primary" value="确认支付"/></div>

<script>
    $(function(){
        $("#btnPay").click(function(){
            if(confirm("确认支付?")) {
                $.ajax({
                    dataType:"json",
                    url:"${basepath}/paygate/dummyPay",
                    type:"POST",
                    data:{orderId:"${payInfo.WIDout_trade_no}"},
                    success:function(data){
                        window.location.href="${basepath}/order/paySuccess.html";
                    },
                    error:function(data){
                        alert("支付失败");
                    }
                });
            }
        });
    })
</script>
</@html.htmlBase>