package com.demo.io.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamHandlerDemo1 {
	
	public static void main(String[] args) {
		
		String filePath = "resources/customer.dat";
		
		AccountHolder accountHolder = new AccountHolder(1, "chandu", 12364597896l, true);
		
		writeDataToFile(filePath,accountHolder);
		
		readDataFromFile(filePath);
	}

	private static void readDataFromFile(String filePath) {
		try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))) {
			
			while(dataInputStream.available() > 0) {
				AccountHolder accountHolder = new AccountHolder(dataInputStream.readInt(), dataInputStream.readUTF(), dataInputStream.readLong(), dataInputStream.readBoolean());
				System.out.println(accountHolder);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeDataToFile(String filePath, AccountHolder accountHolder) {
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath))) {
			dataOutputStream.writeInt(accountHolder.getId());
			dataOutputStream.writeUTF(accountHolder.getName());
			dataOutputStream.writeLong(accountHolder.getAccountNumber());
			dataOutputStream.writeBoolean(accountHolder.isAccountActive());
			System.out.println("data file created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class AccountHolder {
	
	private int id;
	
	private String name;
	
	private Long accountNumber;
	
	private boolean isAccountActive;

	@Override
	public String toString() {
		return "AccountHolder [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", isAccountActive="
				+ isAccountActive + "]";
	}

	public AccountHolder(int id, String name, Long accountNumber, boolean isAccountActive) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.isAccountActive = isAccountActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isAccountActive() {
		return isAccountActive;
	}

	public void setAccountActive(boolean isAccountActive) {
		this.isAccountActive = isAccountActive;
	}
}
