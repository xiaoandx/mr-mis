var API_URL = "http://localhost:8080";

/**
 * @Description: 封装的POST请求方法,带有参数
 * author: WEI.ZHOU
 * @param: path        请求路径
 * @param: data        请求数据
 * @return: Promise 请求结果对象
 * @date: 2021-6-8 18:14:48
 * @version: v1.0.0
 */
function postHasData(path, data) {
	return new Promise(resolve => {
		$.ajax({
			url: API_URL + path,
			async: false,
			method: 'post',
			dataType: 'json',
			contentType: "application/json;charset=utf-8",
			data: JSON.stringify(data),
			success: resolve
		});
	});
}

/**
 * @Description: 封装的POST请求方法,不带有参数
 * author: WEI.ZHOU
 * @param: path        请求路径
 * @param: data        请求数据
 * @return: Promise 请求结果对象
 * @date: 2021-6-8 18:14:48
 * @version: v1.0.0
 */
function postNotData(path) {
	return new Promise(resolve => {
		$.ajax({
			url: API_URL + path,
			async: false,
			method: 'POST',
			dataType: 'json',
			contentType: "application/json;charset-UTF-8",
			success: resolve
		});
	});
}

/**
 * @Description: 封装的GET请求方法，带有参数
 * author: WEI.ZHOU
 * @param: path        请求路径
 * @param: data        请求数据
 * @return: Promise 请求结果对象
 * @date: 2021-6-8 18:14:48
 * @version: v1.0.0
 */
function getHasData(path, data) {
	return new Promise(resolve => {
		$.ajax({
			url: API_URL + path,
			async: false,
			method: 'GET',
			data: JSON.stringify(data),
			success: resolve
		});
	});
}

/**
 * @Description: 封装的GET请求方法，不带有参数
 * author: WEI.ZHOU
 * @param: path        请求路径
 * @param: data        请求数据
 * @return: Promise 请求结果对象
 * @date: 2021-6-8 18:14:48
 * @version: v1.0.0
 */
function getNotData(path) {
	return new Promise(resolve => {
		$.ajax({
			url: API_URL + path,
			async: false,
			method: 'GET',
			success: resolve
		});
	});
}
