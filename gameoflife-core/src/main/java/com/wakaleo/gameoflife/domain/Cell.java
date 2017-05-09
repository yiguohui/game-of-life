package com.wakaleo.gameoflife.domain;

public enum Cell{
	LIVE_CLELL("+"),DEAD_CELL(".");
	private String sysmbol;
	private Cell(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String to String() {
		return symbol;
	}

	static Cell fromSymbol(String  symbol) {
		Cell cellRepresentedBySymbol = null ;
		for ( Cell cell : Cell.values() ){
			if ( cell.symbol.equals(symbol)) {
				cellRepresentdBySymbol = cell;
				break;
			}
		}
		return cellRepresentedBySymbol;
	}


	public String getSymbol() {
		return symbol;
	}

}
