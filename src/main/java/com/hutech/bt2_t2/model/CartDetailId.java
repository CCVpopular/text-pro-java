package com.hutech.bt2_t2.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class CartDetailId implements Serializable {
    private Long cartId;
    private Long productId;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CartDetailId))
            return false;
        CartDetailId that = (CartDetailId) o;
        return Objects.equals(getCartId(), that.getCartId()) &&
                Objects.equals(getProductId(), that.getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCartId(), getProductId());
    }
}