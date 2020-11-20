/*域名+端口 */ 
var domain1 = "http://"+document.domain+":80";

var loginApi = "/blog/ad/admin/login"
var getUserApi = "/blog/ad/admin/getUser"
var getTokenApi = "/blog/ad/admin/getToken"
var addTypeApi = "/blog/ad/admin/data/addType"
var getTypesByPageApi = "/blog/ad/admin/getTypeByPage"
/**
 * 请求url地址
 */
var loginUrl = domain1+loginApi;
var getUserUrl = domain1+getUserApi;
var getTokenUrl = domain1+getTokenApi;
var addTypeUrl = domain1+addTypeApi;
var getTypesByPageUrl = domain1+getTypesByPageApi


/**
 * 前端跳转 地址
 */
var domain2 = "http://"+document.domain+":8000";
var adminIndex = domain2+"/admin/index.html"
var loginPage = domain2+"/admin/login.html"
var typesPage = domain2+"/admin/types.html"