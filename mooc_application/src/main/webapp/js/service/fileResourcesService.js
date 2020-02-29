//服务层
app.service('fileResourcesService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../fileResources/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../fileResources/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../fileResources/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../fileResources/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../fileResources/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../fileResources/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../fileResources/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
