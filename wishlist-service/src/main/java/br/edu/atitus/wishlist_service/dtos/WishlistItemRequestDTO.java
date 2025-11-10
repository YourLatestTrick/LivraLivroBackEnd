package br.edu.atitus.wishlist_service.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class WishlistItemRequestDTO {

    @NotNull(message = "bookId cannot be null")
    private UUID bookId;

    @Min(value = 1, message = "quantity must be greater than 0")
    private int quantity;

    // Getters e Setters
    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
