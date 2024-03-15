function openWin(name, url,data) {
    api.openWin({
        name: name,
        url: url,
        bounces: false,
        softInputMode: 'resize',
        slidBackEnabled: false,
        allowEdit:true,
        // singleInstance:true,
        // reload:true
    });
}

function openCreateLink(wifiSSID){
    // api.openWin({
    //     name: 'createLink',
    //     url: './createLink.html',
    //     bounces: false,
    //     softInputMode: 'resize',
    //     slidBackEnabled: false,
    //     reload:true,
    //     allowEdit:true,
    //     pageParam:{
    //         wifiSSID:wifiSSID
    //     }
    // });
    api.openWin({
        name: 'creatLink_bluetooth',
        url: './creatLink_bluetooth.html',
        bounces: false,
        softInputMode: 'resize',
        slidBackEnabled: false,
        reload:true,
        allowEdit:true,
        pageParam:{
            wifiSSID:wifiSSID
        }
    });
}

function startWithAppInfo() {
    console.log($api.getStorage('gizWifiSDK').appid)
    console.log($api.getStorage('gizWifiSDK').appSerect)
    
    gizWifiSDK.startWithAppInfo({
        "appInfo": {
            "appId": $api.getStorage('gizWifiSDK').appid,
            "appSecret": $api.getStorage('gizWifiSDK').appSerect
        },
        "productInfo":[
            {"productKey":"7f65d22016714defb440e89fc3576042", "productSecret":"a1cef20961f149a8bcd8dfa4a021f7f6","usingAdapter":"GizAdapterWifiBle"}
        ],
    }, function (ret, err) {
        console.log(JSON.stringify(ret))
        gizWifiSDK.setLogLevel({"logLevel": 3})
        if(ret){
            if (ret.errorCode == 8316) {
                isGizWifiSDKStart = true
            } else {
                startWithAppInfo()
            }
        }
    });
}