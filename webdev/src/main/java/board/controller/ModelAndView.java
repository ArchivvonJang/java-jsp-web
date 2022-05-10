package board.controller;

import java.util.HashMap;
import java.util.Map;

public class ModelAndView {
	private Map<String, Object> model = new HashMap<String, Object>();  //Model에서 처리한 결과데이터를 저장하기 위한 Map
	private String viewName; //다음 view의 경로를 저장하는 변수
	
	//디폴트 생성자
	public ModelAndView() {}//Default Constructor
	
	//생성자 오버로딩
	public ModelAndView(String viewName) {
		setViewName(viewName);
	}
	// 							view경로, view에 보내줄 키와 값
	public ModelAndView(String viewName, String key, Object obj) {
		setViewName(viewName);
		addObject(key, obj);
	}
	
	public Map<String, Object> getModel() {
		return model;
	}
	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	 //model맵에 key와 value를 저장하기 위한 메소드
	public void addObject(String key, Object obj) {
		model.put(key, obj);
	}
	
	
}
