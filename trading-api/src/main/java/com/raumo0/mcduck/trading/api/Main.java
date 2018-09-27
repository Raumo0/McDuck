package com.raumo0.mcduck.trading.api;

import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.bitmex.BitmexExchange;
import org.knowm.xchange.bitmex.BitmexPrompt;
import org.knowm.xchange.bitmex.dto.marketdata.BitmexKline;
import org.knowm.xchange.bitmex.service.BitmexMarketDataServiceRaw;
import org.knowm.xchange.currency.CurrencyPair;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static String getMessage() throws IOException, ParseException {
        BitmexExchange bitmex = (BitmexExchange) ExchangeFactory.INSTANCE.createExchange(BitmexExchange.class.getName());
        BitmexMarketDataServiceRaw bitmexMarketDataServiceRaw = new BitmexMarketDataServiceRaw(bitmex);
        String binSize = "1m";
        Boolean partial = false;
        CurrencyPair pair = CurrencyPair.XBT_USD;
        BitmexPrompt prompt = BitmexPrompt.PERPETUAL;
        long count = 1;
        Boolean reverse = true;
        List<BitmexKline> klines = bitmexMarketDataServiceRaw.getBucketedTrades(binSize, partial, pair, prompt, count, reverse);
        System.out.println(klines);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Date parsedDate = dateFormat.parse(klines.get(0).getTimestamp());
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        System.out.println(timestamp);
        System.out.println(timestamp.getTime());
        return "Hello from trading-api!";
    }
}
