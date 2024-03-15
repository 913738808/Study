// let date = new Date(1691546699564)
// // let timestamp = date.getTime()
// // timestamp = timestamp - (date.getHours() * 60 * 60 * 1000 )
// // timestamp -= date.getMinutes() * 60 * 1000
// // timestamp -= date.getSeconds() * 1000

// // timestamp -= 0*24*3600*1000
// console.log(dateFormat(date,'yyyy-MM-dd HH:mm:ss'))
// // console.log(new Date(timestamp))

// // console.log(date.getHours())


// function dateFormat (date, format) {
//     date = new Date(date);
//     var o = {
//         'M+' : date.getMonth() + 1, //month
//         'd+' : date.getDate(), //day
//         'H+' : date.getHours(), //hour+8小时
//         'm+' : date.getMinutes(), //minute
//         's+' : date.getSeconds(), //second
//         'q+' : Math.floor((date.getMonth() + 3) / 3), //quarter
//         'S' : date.getMilliseconds() //millisecond
//     };
//     if (/(y+)/.test(format))
//         format = format.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length));

//     for (var k in o)
//         if (new RegExp('(' + k + ')').test(format))
//             format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ('00' + o[k]).substr(('' + o[k]).length));

//     return format;
// }

function asyncTest(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log(123)
            resolve(456)
        },1000)
    })
}

async function main(){
    for(let i = 0;i<3;i++){
        try {
            let ret = await asyncTest()
            
        } catch (error) {
            
        }
        if(ret){

        }else{
            main()
            break
        }
        console.log(ret)
    }
}

main()