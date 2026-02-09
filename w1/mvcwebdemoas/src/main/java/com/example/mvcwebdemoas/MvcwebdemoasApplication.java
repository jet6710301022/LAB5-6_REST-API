package com.example.mvcwebdemoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MvcwebdemoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcwebdemoasApplication.class, args);
	}

	// เพิ่มโค้ดส่วนนี้ต่อจาก method registration เดิม
@GetMapping("/contactus")
public String contactUs() {
    return "contactus"; // ชื่อไฟล์ html (ไม่ต้องใส่นามสกุล .html)
}
}
