let history = null

function init(){
    history = $api.getStorage('history') || '{}';
    try {
        console.log(history)
        history = JSON.parse(history)

        history = {
            "18258423177":[
                {
                    data:[]
                }
            ]   
        }

    } catch (error) {
        console.log("历史数据转码失败")
    }
}
