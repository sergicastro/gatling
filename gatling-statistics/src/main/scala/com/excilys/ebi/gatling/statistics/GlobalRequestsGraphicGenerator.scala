package com.excilys.ebi.gatling.statistics
import com.excilys.ebi.gatling.statistics.presenter.GlobalRequestsDataPresenter
import com.excilys.ebi.gatling.statistics.extractor.GlobalRequestsDataExtractor

class GlobalRequestsGraphicGenerator extends GraphicGenerator(new GlobalRequestsDataExtractor, new GlobalRequestsDataPresenter) {

}