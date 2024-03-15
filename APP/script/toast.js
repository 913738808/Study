var ToastTimer = null
function openToast(toastAlarm){
    document.getElementById('toastBG').style.display = "block"
    var img = document.getElementById('ToastImg')
    var text = document.getElementById('ToastText')
    var index = 1
    if(toastAlarm[0].img){
        ToastImg.src = toastAlarm[0].img
    }
    ToastText.innerHTML = toastAlarm[0].text
    if(toastAlarm.length>1){  
        // 当传入参数长度大于1时开启定时器
        ToastTimer = setInterval(function(){
            if(index>=toastAlarm.length){
                index = 0
            }
            if(toastAlarm[index].img){
                ToastImg.src = toastAlarm[index].img
            }
            ToastText.innerHTML = toastAlarm[index].text
            index++
        },2000)
    }
}
var toastDOM = `
    <div class="toastBG" id="toastBG" onclick="hideToast()">
        <div class="toast" onclick="stopPropagation(event)">
        <div class="toast_title">
            <img id="ToastImg" height="30px" alt="" srcset="">&nbsp;&nbsp;<p id="ToastText"></p>
        </div>
        <div class="toastbtn">
            <div class="toast_leftbtn" id="cancel" i18n="login.cancel" onclick="hideToast()">取消</div>
            <div class="toast_rightbtn" i18n="login.confirm" id="confirm" onclick="hideToast()">确认</div>                
        </div>
        </div>
    </div>
`
// 初始化toast控件 使用此控件必须引入toast.js 和 toast.css
function initToast(){
    document.getElementsByTagName('body')[0].innerHTML +=  toastDOM
}

// 阻止事件传递
function stopPropagation(event){
    event.stopPropagation()
}
// 隐藏次控件
function hideToast(){
    document.getElementById('toastBG').style.display = "none"
    if(ToastTimer){
        clearInterval(ToastTimer)
        ToastTimer = null
    }
}