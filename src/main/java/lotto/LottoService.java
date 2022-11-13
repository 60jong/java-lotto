package lotto;

import java.util.List;

public interface LottoService {
    int getOrderQuantity(int orderPrice);

    List<Lotto> createLottos(int orderQuantity);

    WinningLotto createWinningLotto(List<Integer> lottoNumbers, int bonusNumber);
}
