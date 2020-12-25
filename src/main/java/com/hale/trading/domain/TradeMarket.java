package com.hale.trading.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeMarket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marketId;
    private Long tradeId;
    private Double startPrice;
    private LocalDateTime openDate;
    private String description;
    @Enumerated(EnumType.STRING)
    private TradeStatus status;
    private Double currentPrice;
    private DeliveryStatus deliveryStatus;

}
