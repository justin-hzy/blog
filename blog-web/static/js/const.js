/*域名+端口 */ 
var domain = "http://"+document.domain+":80";
var loginApi = "/blog/ad/admin/login"
var getUserApi = "/blog/ad/admin/getUser"
/**
 * 请求url地址
 */
var loginUrl = domain+loginApi;
var getUserUrl = domain+getUserApi;