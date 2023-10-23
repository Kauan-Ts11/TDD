package com.api.testtdd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auctions")
public class AuctionModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDateTime start, finish;
    private UUID product;
    private UUID bidChampion;

    @Transient private List<BidModel> allBids;
    @Transient private BidModel highestBid;
    @Transient private BigDecimal bidAverageValue;
    @Transient private int countBids;
}
