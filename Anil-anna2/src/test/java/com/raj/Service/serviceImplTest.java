package com.raj.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.when;
import com.raj.exception.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import com.raj.Repository.productRepository;
import com.raj.entity.product;

@ExtendWith(MockitoExtension.class)
class serviceImplTest {

	@Mock
	private productRepository repo;
	@Mock
	private product product;
	private Optional<product> product1;

	@InjectMocks
	private serviceImpl ser;

//	@BeforeEach
//	void setUp() throws Exception {
//		autoclosable = MockitoAnnotations.openMocks(this);
//		ser = new serviceImpl();
//		product = new product();
//		product.builder().Description("discription1").id(1).name("product1").price(new BigDecimal(121)).build();
//		repo.save(product);
//	}

//	@AfterEach
//	void tearDown() throws Exception {
//		autoclosable.close();
//	}

	@Test
	void testCreateProduct() {
		// when(repo.save(product)).thenReturn(product);
		assertThat(ser.createProduct(product)).isEqualTo("success");
	}

	@Test
	void testUpdateProductsuccess() {
	
	when(repo.findById(product.getId())).thenReturn(Optional.of(product));
		assertThat(ser.updateProduct(product)).isEqualTo("success");
	}

	@Test
	void testUpdateProductfailure() {
	
	//when(repo.findById(product.getId())).thenReturn(Optional.of(product));
		//assertThat(ser.updateProduct(product)).isEqualTo("success");
		 Exception exception = assertThrows(NoproductFoundException.class, () -> {
		        ser.updateProduct(product);
		        });

		    String expectedMessage = "No product found with given id:";
		    String actualMessage = exception.getMessage();

		    assertTrue(actualMessage.contains(expectedMessage));
		 }
	@Test
	void testGetallproducts() {
	
		when(repo.findAll()).thenReturn(new ArrayList<>(Collections.singleton(product)));
		assertThat(ser.getallproducts().get(0).getName()).isEqualTo(product.getName());
	}

	@Test
	void testGetproductByid() {
		when(repo.findById(1)).thenReturn(Optional.ofNullable(product));
		assertThat(ser.getproductByid(1).getName()).isEqualTo(product.getName());

	}

	@Test
	void testDeleteProductfailure() {
		doAnswer(Answers.CALLS_REAL_METHODS).when(repo).deleteAllById(any());
	 	assertThat(ser.deleteProduct(1)).isEqualTo("success");
}
	@Test
	void testDeleteProductsuccess() {
		when(repo.findById(product.getId())).thenReturn(Optional.of(product));
		//ser.createProduct(product);
		assertThat(ser.deleteProduct(0)).isEqualTo("success");
}

	@Test
	void testgetproductbyname() {
		when(repo.findByName("product1")).thenReturn(new ArrayList<>(Collections.singleton(product)));

		assertThat(ser.getproductByid(1).getName()).isEqualTo(product.getName());
	}
}
