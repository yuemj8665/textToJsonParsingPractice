package randomJsonVO.Random1VO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/****************************
 * 연습용 JSON 내용
 ****************************
 * [ - List<String>
 *   "afternoon",
 *   true,
 *   false,
 *   [ - List<String>
 *     "train",
 *     "former",
 *     false,
 *     { - Map<String,String>
 *       "must": "trouble",
 *       "may": -1718813585,
 *       "mysterious": -1866488416.359261,
 *       "few": -658658767.5805988,
 *       "eventually": 385795595.6886649,
 *       "close": 1450375933.191811
 *     },
 *     "possible",
 *     "vertical"
 *   ],
 *   false,
 *   -1654863231.5048943
 * ]
 *
 */
@Getter
@Setter
public class Random1VO {
    String string1;
    Boolean boo1;
    Boolean boo2;
    Random1VO_List list1;
    Boolean boo3;
    Long long1;
}
