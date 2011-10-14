package com.excilys.ebi.gatling.statistics.generator

import com.excilys.ebi.gatling.statistics.extractor.DetailsRequestsDataExtractor
import com.excilys.ebi.gatling.statistics.presenter.DetailsRequestsDataPresenter

class DetailsRequestsGraphicGenerator extends SimpleGraphicGenerator(new DetailsRequestsDataExtractor, new DetailsRequestsDataPresenter)