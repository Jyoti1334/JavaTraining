package com.oops.list;


import java.util.*;


public class JavaList{
	//Create List
	List<String> languageList = new ArrayList<String>();
	
	
	
	/***
	 * To add new element in list
	 * @return
	 */
	public List<String>  toaddElemnet(){
		languageList.add("English");
		languageList.add("Marathi");
		languageList.add("Hindi");
		languageList.add("Sanskrit");
		languageList.add("Malyalam");
		
		for (int i = 0; i < languageList.size(); i++) {
			System.out.println("ArrayList Element : "+languageList.get(i));
		}
		return languageList;
	
	}
	/***
	 * to display Arraylist 
	 * @return
	 */
	public List<String> todispalyList(){
		System.out.println("Arraylist is :"+languageList);
		return languageList;
		
	}
	
	/***
	 * to remove elements from list
	 * @return
	 */
	public List<String> toremoveElement(){
		languageList.remove(2);//by passing index
		languageList.remove("English");//by passing element
		System.out.println("List after removing element is :"+languageList);
		return languageList;
	}
	
	
	/***
	 *  to display the size of list
	 * @return
	 */
	public List<String> todisplaySize(){
		System.out.println("Size of list :"+languageList.size());
		return languageList;
	}
	
	
	/***
	 *  to add new element in list
	 * @return
	 */
	public List<String> toaddNewElement(){
		languageList.add(2, "Tamil");
		System.out.println("List after adding new element :"+languageList);
		return languageList;
	}
	
	/***
	 * to replace one element with new element
	 * @return
	 */
	public List<String> torepalceElement(){
		languageList.set(2, "Marvadi");
		System.out.println("List after replacing element :"+languageList);
		return languageList;
	}
	
	
	/***
	 *  to check wheather the given element is present in list or not
	 * @return
	 */
	public List<String> tocheckElement(){
		
		System.out.println("List to check element :"+languageList.contains("Marathi"));
		return languageList;
	}
	
	/***
	 * to get element on specified index value
	 * @return
	 */
	public List<String> togetElement(){
		System.out.println("List to get element :"+languageList.get(2));
		return languageList;
	}
	
	/***
	 * to check the index of given element
	 * @return
	 */
	public List<String> tocheckIndexofElement(){
		System.out.println("Index of element : "+languageList.indexOf("Marvadi"));
		return languageList;
	}
	
	/***
	 * to extract elements from the list
	 * @return
	 */
	public List<String> toextractElement(){
	Iterator itList =languageList.iterator();
	while(itList.hasNext()){
		System.out.println("Retrieve Elements :"+itList.next());
	}
	return languageList;
	
	}
	
	
	

}
