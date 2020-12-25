package com.hale.trading.repository;

import com.hale.trading.domain.TradeMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeMarketRepository extends JpaRepository<TradeMarket, Long> {
}
