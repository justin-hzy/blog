/*域名+端口 */ 
var domain1 = "http://"+document.domain+":80";

/* 管理员登录模块 */
var loginApi = "/blog/ad/admin/login"


var getUserApi = "/blog/ad/admin/getUser"

var getTokenApi = "/blog/ad/admin/getToken"
/* 分类 */
var addTypeApi = "/blog/ad/admin/data/addType"
var getTypesByPageApi = "/blog/ad/admin/getTypeByPage"
var getTypeByTypeIdApi = "/blog/ad/admin/getTypeByTypeId"
var updateTypeApi = "/blog/ad/admin/data/updateType"
var deleteTypeByTypeIdApi = "/blog/ad/admin/data/deleteTypeByTypeId"
/* 标签 */
var addTagApi = "/blog/ad/admin/data/addTag"
var getTagsByPageApi = "/blog/ad/admin/getTagsByPage"
var getTagByTagIdApi = "/blog/ad/admin/getTagByTagId"
var updateTagApi = "/blog/ad/admin/data/updateTag"
var deleteTagByTagIdApi = "/blog/ad/admin/data/deleteTagByTagId"

var getBlogsApi="/blog/user/blogs/selectBlogs"
/**
 * 请求url地址
 */
var loginUrl = domain1+loginApi;
var getUserUrl = domain1+getUserApi;

var getTokenUrl = domain1+getTokenApi;
/* 分类 */
var addTypeUrl = domain1+addTypeApi;
var getTypesByPageUrl = domain1+getTypesByPageApi
var getTypeByTypeIdUrl = domain1+getTypeByTypeIdApi
var updateTypeUrl = domain1+updateTypeApi
var deleteTypeByTypeIdUrl = domain1+deleteTypeByTypeIdApi

/* 标签 */
var addTagUrl = domain1+addTagApi
var getTagsByPageUrl = domain1+getTagsByPageApi
var getTagByTagIdUrl = domain1+getTagByTagIdApi
var updateTagUrl = domain1+updateTagApi
var deleteTagByTagIdUrl = domain1+deleteTagByTagIdApi;


var getBlogsUrl = domain1+getBlogsApi


/**
 * 前端跳转 地址
 */
var domain2 = "http://"+document.domain+":8000";
/* 管理员后台主页 */
var adminIndex = domain2+"/admin/index.html"
/* 登录页面 */
var loginPage = domain2+"/admin/login.html"
/* 分类管理页面 */
var typesPage = domain2+"/admin/types.html"
/* 分类新增页面 */
var typesInputPage = domain2+"/admin/type-input.html"
/* 分类修改页面 */
var typesEditPage = domain2+"/admin/type-edit.html"
/* 标签管理主页 */
var tagsPage = domain2+"/admin/tags.html"
/* 标签修改页面 */
var tagEditPage = domain2+"/admin/tag-edit.html"