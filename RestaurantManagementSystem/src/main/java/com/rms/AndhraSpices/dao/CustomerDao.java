package com.rms.AndhraSpices.dao;


import java.util.List;

import com.rms.AndhraSpices.entities.Address;
import com.rms.AndhraSpices.entities.Branch;
import com.rms.AndhraSpices.entities.CarryBox;
import com.rms.AndhraSpices.entities.Category;
import com.rms.AndhraSpices.entities.Item;
import com.rms.AndhraSpices.entities.Order;
import com.rms.AndhraSpices.entities.User;

public interface CustomerDao {

	public int generateAddressId();
	public int generateOrderId();
	public int generatePrimaryIdForOrder();
	public Branch getABranchDetails(int branchId);
	public Category getACategoryDetails(int categoryId);
	public CarryBox getACarryBoxDetails(int carryBoxId);
	public User getAnUserDetails(String emailId);
	public Address getAnAddressDetails(int addressId);
	public boolean addANewAddress(Address address);
	public boolean updateAnAddress(Address address);
	public boolean deleteAnAddress(int addressId);
	public void placeAnOrder(Order order);
	public List<Order> getAnOrderDetails(int orderId);
	public Item getAnItemDetails(int itemId);
	public void updateCarryBox(CarryBox carryBox);
	public List<Branch> getAllBranches();
	
}
