package com.edu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductCatalog {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int ProductID;
		@Column(nullable = false)
		private String ProductName;
		@Column(nullable = false)
		private double ProductPrice;
		@Column(nullable = false, length = 3000000)
		private String ProductImage;
		@Column(nullable = false)
		private String ProductStatus;
		@Column
		private int ProductQty;
		
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public double getProductPrice() {
			return ProductPrice;
		}
		public void setProductPrice(double productPrice) {
			ProductPrice = productPrice;
		}
		public String getProductImage() {
			return ProductImage;
		}
		public void setProductImage(String productImage) {
			ProductImage = productImage;
		}
		public String getProductStatus() {
			return ProductStatus;
		}
		public void setProductStatus(String productStatus) {
			ProductStatus = productStatus;
		}
		public int getProductQty() {
			return ProductQty;
		}
		public void setProductQty(int productQty) {
			ProductQty = productQty;
		}
}
