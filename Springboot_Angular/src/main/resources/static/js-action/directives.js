//定义一个指令为datePicker
actionApp.directive('datePicker',function () {
    return{
        //限制属性指令和样式指令
        restrict:'AC',
        //link方法定义指令,在link方法内可以使用当前scope、当前元素和元素属性
        link:function (scope, elem, attrs) {
            //初始化jqueryui的写法
            elem.datepicker();
        }
    }
});