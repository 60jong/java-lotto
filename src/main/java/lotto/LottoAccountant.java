package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoAccountant {
    private LottoResultMaker lottoResultMaker;

    public LottoAccountant(LottoResultMaker lottoResultMaker) {
        this.lottoResultMaker = lottoResultMaker;
    }

    public List<LottoResult> getLottoResults(WinningLotto winningLotto, List<Lotto> userLottos) {
        List<LottoResult> lottoResults = new ArrayList<>();

        for (Lotto userLotto : userLottos) {
            lottoResults.add(lottoResultMaker.getLottoResult(winningLotto, userLotto));
        }

        return lottoResults;
    }

}
