package dr.cart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/cart")
@Controller
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public ModelAndView getCartService() {
        final ModelAndView mav = new ModelAndView();
        mav.setViewName("cart");
        mav.getModel().put("product", cartService.getProducts());
        return mav;
    }


}
