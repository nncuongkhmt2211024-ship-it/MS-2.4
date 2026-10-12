package cuong.com.userservice.controller;

import cuong.com.userservice.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id) {
        // Giả lập: Nếu ID không tồn tại trong Database (ví dụ ID = 999) thì ném lỗi
        if (id == 999) {
            throw new ResourceNotFoundException("Order với ID " + id + " không tồn tại trên hệ thống!");
        }

        return "Lấy thông tin order thành công!";
    }
}