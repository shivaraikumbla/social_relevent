/**
 * UserService
 */
app.factory('UserService',function($http){
	var userService={}//intianted object
	
	var BASE_URL = "http://localhost:8060/collaboration_middleware"
	
	userService.register=function(user){//add function,all the poperties
	 return $http.post(BASE_URL + "/register",user)//insert
	}
	
	userService.login=function(user){//email, password
		 return $http.post(BASE_URL + "/login",user)
	}
	
	userService.logout=function(){
		return $http.put(BASE_URL + "/logout")
		
	}
	userService.getUserDetails=function(){
		return $http.get(BASE_URL + "/getuser")
	}
	
	userService.update=function(user){
		return $http.put(BASE_URL + "/update",user)
	}
	return userService;//return object
})