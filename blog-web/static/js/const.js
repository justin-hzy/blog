/*域名+端口 */ 
var domain1 = "http://"+document.domain+":80";
var loginApi = "/blog/ad/admin/login"
var getUserApi = "/blog/ad/admin/getUser"
/**
 * 请求url地址
 */
var loginUrl = domain1+loginApi;
var getUserUrl = domain1+getUserApi;

/**
 * 前端跳转 地址
 */
var domain2 = "http://"+document.domain+":8000";
var adminIndex = domain2+"/admin/index.html"