package com.rms.AndhraSpices.services;

import java.util.List;
import java.util.Set;

import com.rms.AndhraSpices.entities.Address;
import com.rms.AndhraSpices.entities.BranchDto;
import com.rms.AndhraSpices.entities.CarryBox;
import com.rms.AndhraSpices.entities.Category;
import com.rms.AndhraSpices.entities.Item;
import com.rms.AndhraSpices.entities.Order;
import com.rms.AndhraSpices.entities.SubCategory;
import com.rms.AndhraSpices.entities.User;
import com.rms.AndhraSpices.exceptions.OrderContainsInactiveItemsException;
import com.rms.AndhraSpices.exceptions.OutOfLocationRangeException;
import com.rms.AndhraSpices.exceptions.ResourceNotFoundException;

public interface CustomerService {

	public List<Item> getABranchItems(int branchId) throws ResourceNotFoundException;
	public List<Category> getABranchCategories(int branchId) throws ResourceNotFoundException;
	public List<SubCategory> getABranchSubCategories(int branchId);
	public CarryBox getACarryBoxDetails(String emailId) throws ResourceNotFoundException;
	public List<Address> getAnUserAdresses(String emailId) throws ResourceNotFoundException;
	public boolean addANewAddress(String emailId,Address address);
	public boolean deleteAnAddress(int addressId);
	public List<Order> getAnUserOrders(String emailId) throws ResourceNotFoundException;
	public int placeANewOrder(String emailId,int branchId,int addressId) throws ResourceNotFoundException,OutOfLocationRangeException,OrderContainsInactiveItemsException;
	public List<Order> trackAnOrder(int orderId)throws ResourceNotFoundException;
	public boolean addItemToCarryBox(String emailId, int itemId);
	public boolean deleteACarryBoxItem(String emailId,int itemId);
	public boolean updateACarryBoxItem(String emailId,int itemId,int quantity);
	public Set<Item> searchItems(int branchId,String searchText);
	public boolean clearACarryBox(String emailId);
	public User getAnUserDetails(String emailId);
	boolean UpdateAnAddress(String emailId, Address address) throws ResourceNotFoundException;
	public List<BranchDto> getAllBranches();
	
}
