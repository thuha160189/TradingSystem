package com.hale.trading.repository;

import com.hale.trading.domain.Trading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradingRepository extends JpaRepository<Trading, Long> {
}
