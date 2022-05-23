package com.absa.practical.bookservice.mapper;

import com.absa.practical.bookservice.dto.AuthorDto;
import com.absa.practical.bookservice.dto.BookDto;
import com.absa.practical.bookservice.dto.OrderDto;
import com.absa.practical.bookservice.dto.OrderItemDto;
import com.absa.practical.bookservice.model.Author;
import com.absa.practical.bookservice.model.Book;
import com.absa.practical.bookservice.model.Order;
import com.absa.practical.bookservice.model.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookStoreMapper {

    Book mapBookDtoToBook(BookDto bookDto);

    BookDto mapBookToBookDto(Book book);

    Author mapAuthorDtoToAuthor(AuthorDto authorDto);

    AuthorDto mapAuthorToAuthorDto(Author author);

    Order mapOrderDtoToOrder(OrderDto orderDto);

    OrderDto mapOrderToOrderDto(Order order);

    OrderItem mapOrderItemDtoToOrderItem(OrderItemDto orderItemDto);

    OrderItemDto mapOrderItemToOrderItemDto(OrderItem orderItem);
}
