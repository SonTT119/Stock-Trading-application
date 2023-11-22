package com.neu.edu.stocktrading.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockAPIBean
{

    private String symbol;
    private String exchange;
    private String displayName;
    private String dayCode;
    private String serverTimestamp;
    private String mode;
    private String postMarketPrice;
    private String tradeTimestamp;
    private String netChange;
    private String percentChange;
    private String unitCode;
    private String open;
    private String high = "0.0";
    private String low = "0.0";
    private String close;
    private String flag;
    private String volume;
    private String fiftyTwoWeekHigh = "0.0";
    private String fiftyTwoWeekHighDate;
    private String fiftyTwoWeekLow = "0.0";
    private String fiftyTwoWeekLowDate;


    public StockAPIBean() {
    }

    public StockAPIBean(String symbol, String exchange, String displayName, String dayCode, String serverTimestamp, String mode, String postMarketPrice, String tradeTimestamp, String netChange, String percentChange, String unitCode, String open, String high, String low, String close, String flag, String volume, String fiftyTwoWeekHigh, String fiftyTwoWeekHighDate, String fiftyTwoWeekLow, String fiftyTwoWeekLowDate) {
        this.symbol = symbol;
        this.exchange = exchange;
        this.displayName = displayName;
        this.dayCode = dayCode;
        this.serverTimestamp = serverTimestamp;
        this.mode = mode;
        this.postMarketPrice = postMarketPrice;
        this.tradeTimestamp = tradeTimestamp;
        this.netChange = netChange;
        this.percentChange = percentChange;
        this.unitCode = unitCode;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.flag = flag;
        this.volume = volume;
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
        this.fiftyTwoWeekHighDate = fiftyTwoWeekHighDate;
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
        this.fiftyTwoWeekLowDate = fiftyTwoWeekLowDate;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExchange() {
        return this.exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getdisplayName() {
        return this.displayName;
    }

    public void setdisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDayCode() {
        return this.dayCode;
    }

    public void setDayCode(String dayCode) {
        this.dayCode = dayCode;
    }

    public String getServerTimestamp() {
        return this.serverTimestamp;
    }

    public void setServerTimestamp(String serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getpostMarketPrice() {
        return this.postMarketPrice;
    }

    public void setpostMarketPrice(String postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
    }

    public String getTradeTimestamp() {
        return this.tradeTimestamp;
    }

    public void setTradeTimestamp(String tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
    }

    public String getNetChange() {
        return this.netChange;
    }

    public void setNetChange(String netChange) {
        this.netChange = netChange;
    }

    public String getPercentChange() {
        return this.percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getUnitCode() {
        return this.unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getOpen() {
        return this.open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return this.high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return this.low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return this.close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getVolume() {
        return this.volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getfiftyTwoWeekHigh() {
        return this.fiftyTwoWeekHigh;
    }

    public void setfiftyTwoWeekHigh(String fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public String getfiftyTwoWeekHighDate() {
        return this.fiftyTwoWeekHighDate;
    }

    public void setfiftyTwoWeekHighDate(String fiftyTwoWeekHighDate) {
        this.fiftyTwoWeekHighDate = fiftyTwoWeekHighDate;
    }

    public String getfiftyTwoWeekLow() {
        return this.fiftyTwoWeekLow;
    }

    public void setfiftyTwoWeekLow(String fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public String getfiftyTwoWeekLowDate() {
        return this.fiftyTwoWeekLowDate;
    }

    public void setfiftyTwoWeekLowDate(String fiftyTwoWeekLowDate) {
        this.fiftyTwoWeekLowDate = fiftyTwoWeekLowDate;
    }

    public StockAPIBean symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public StockAPIBean exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public StockAPIBean displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public StockAPIBean dayCode(String dayCode) {
        this.dayCode = dayCode;
        return this;
    }

    public StockAPIBean serverTimestamp(String serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
        return this;
    }

    public StockAPIBean mode(String mode) {
        this.mode = mode;
        return this;
    }

    public StockAPIBean postMarketPrice(String postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
        return this;
    }

    public StockAPIBean tradeTimestamp(String tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
        return this;
    }

    public StockAPIBean netChange(String netChange) {
        this.netChange = netChange;
        return this;
    }

    public StockAPIBean percentChange(String percentChange) {
        this.percentChange = percentChange;
        return this;
    }

    public StockAPIBean unitCode(String unitCode) {
        this.unitCode = unitCode;
        return this;
    }

    public StockAPIBean open(String open) {
        this.open = open;
        return this;
    }

    public StockAPIBean high(String high) {
        this.high = high;
        return this;
    }

    public StockAPIBean low(String low) {
        this.low = low;
        return this;
    }

    public StockAPIBean close(String close) {
        this.close = close;
        return this;
    }

    public StockAPIBean flag(String flag) {
        this.flag = flag;
        return this;
    }

    public StockAPIBean volume(String volume) {
        this.volume = volume;
        return this;
    }

    public StockAPIBean fiftyTwoWeekHigh(String fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
        return this;
    }

    public StockAPIBean fiftyTwoWeekHighDate(String fiftyTwoWeekHighDate) {
        this.fiftyTwoWeekHighDate = fiftyTwoWeekHighDate;
        return this;
    }

    public StockAPIBean fiftyTwoWeekLow(String fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
        return this;
    }

    public StockAPIBean fiftyTwoWeekLowDate(String fiftyTwoWeekLowDate) {
        this.fiftyTwoWeekLowDate = fiftyTwoWeekLowDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StockAPIBean)) {
            return false;
        }
        StockAPIBean stockAPIBean = (StockAPIBean) o;
        return Objects.equals(symbol, stockAPIBean.symbol) && Objects.equals(exchange, stockAPIBean.exchange) && Objects.equals(displayName, stockAPIBean.displayName) && Objects.equals(dayCode, stockAPIBean.dayCode) && Objects.equals(serverTimestamp, stockAPIBean.serverTimestamp) && Objects.equals(mode, stockAPIBean.mode) && Objects.equals(postMarketPrice, stockAPIBean.postMarketPrice) && Objects.equals(tradeTimestamp, stockAPIBean.tradeTimestamp) && Objects.equals(netChange, stockAPIBean.netChange) && Objects.equals(percentChange, stockAPIBean.percentChange) && Objects.equals(unitCode, stockAPIBean.unitCode) && Objects.equals(open, stockAPIBean.open) && Objects.equals(high, stockAPIBean.high) && Objects.equals(low, stockAPIBean.low) && Objects.equals(close, stockAPIBean.close) && Objects.equals(flag, stockAPIBean.flag) && Objects.equals(volume, stockAPIBean.volume) && Objects.equals(fiftyTwoWeekHigh, stockAPIBean.fiftyTwoWeekHigh) && Objects.equals(fiftyTwoWeekHighDate, stockAPIBean.fiftyTwoWeekHighDate) && Objects.equals(fiftyTwoWeekLow, stockAPIBean.fiftyTwoWeekLow) && Objects.equals(fiftyTwoWeekLowDate, stockAPIBean.fiftyTwoWeekLowDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exchange, displayName, dayCode, serverTimestamp, mode, postMarketPrice, tradeTimestamp, netChange, percentChange, unitCode, open, high, low, close, flag, volume, fiftyTwoWeekHigh, fiftyTwoWeekHighDate, fiftyTwoWeekLow, fiftyTwoWeekLowDate);
    }

    @Override
    public String toString() {
        return "{" +
            " symbol='" + getSymbol() + "'" +
            ", exchange='" + getExchange() + "'" +
            ", displayName='" + getdisplayName() + "'" +
            ", dayCode='" + getDayCode() + "'" +
            ", serverTimestamp='" + getServerTimestamp() + "'" +
            ", mode='" + getMode() + "'" +
            ", postMarketPrice='" + getpostMarketPrice() + "'" +
            ", tradeTimestamp='" + getTradeTimestamp() + "'" +
            ", netChange='" + getNetChange() + "'" +
            ", percentChange='" + getPercentChange() + "'" +
            ", unitCode='" + getUnitCode() + "'" +
            ", open='" + getOpen() + "'" +
            ", high='" + getHigh() + "'" +
            ", low='" + getLow() + "'" +
            ", close='" + getClose() + "'" +
            ", flag='" + getFlag() + "'" +
            ", volume='" + getVolume() + "'" +
            ", fiftyTwoWeekHigh='" + getfiftyTwoWeekHigh() + "'" +
            ", fiftyTwoWeekHighDate='" + getfiftyTwoWeekHighDate() + "'" +
            ", fiftyTwoWeekLow='" + getfiftyTwoWeekLow() + "'" +
            ", fiftyTwoWeekLowDate='" + getfiftyTwoWeekLowDate() + "'" +
            "}";
    }




      
}