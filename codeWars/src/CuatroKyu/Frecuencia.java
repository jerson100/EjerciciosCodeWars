package CuatroKyu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Frecuencia {

	public static void main(String[] args) {
		System.out.println(top3(
				"WPx'Mn_LzBeegoBwq;mUUGfw QjNqCd_TLfeKOGszj QjNqCd vBhpHTe ZLVH LzBeegoBwq x'cZhe-GlPdFi!CvBjRtVT WPx'Mn_GlPdFi/WPx'Mn!NkTjuZBNwW CvBjRtVT IhCADUcFq xkr WPx'Mn GVh GlPdFi ZLVH-vBhpHTe,UMhIhYto GVh_MGpLzGM TLfeKOGszj TLfeKOGszj WQoklhhc CvBjRtVT_CvBjRtVT_GlPdFi WPx'Mn GlPdFi?NkTjuZBNwW GVh IhCADUcFq;GVh WQoklhhc TLfeKOGszj QjNqCd IhCADUcFq IhCADUcFq x'cZhe/WPx'Mn:CvBjRtVT?vBhpHTe WPx'Mn IhCADUcFq.MGpLzGM xVsoUon;IhCADUcFq IhCADUcFq-LzBeegoBwq CvBjRtVT!x'cZhe:QjNqCd IhCADUcFq,QjNqCd?CvBjRtVT;QjNqCd/QjNqCd,x'cZhe x'cZhe IhCADUcFq?LzBeegoBwq!TLfeKOGszj;TdSRWTfm LzBeegoBwq:TLfeKOGszj xkr IhCADUcFq QjNqCd!x'cZhe mUUGfw ZLVH-GVh?x'cZhe;TLfeKOGszj!TLfeKOGszj/LzBeegoBwq:TLfeKOGszj;GVh QjNqCd x'cZhe.UMhIhYto TLfeKOGszj GlPdFi IhCADUcFq WPx'Mn-CvBjRtVT TLfeKOGszj:WPx'Mn GlPdFi.x'cZhe_GlPdFi!WPx'Mn,mUUGfw QjNqCd QjNqCd_WPx'Mn vBhpHTe mUUGfw-LzBeegoBwq LzBeegoBwq-CvBjRtVT WPx'Mn IhCADUcFq vBhpHTe_WPx'Mn xkr IhCADUcFq:xkr-MGpLzGM;WQoklhhc/vBhpHTe LzBeegoBwq:GVh:WPx'Mn mUUGfw!LzBeegoBwq/QjNqCd;IhCADUcFq?UMhIhYto WQoklhhc!TLfeKOGszj CvBjRtVT xkr,LzBeegoBwq WPx'Mn CvBjRtVT GlPdFi/TLfeKOGszj QjNqCd,UMhIhYto mUUGfw LzBeegoBwq:CvBjRtVT LzBeegoBwq IhCADUcFq,UMhIhYto NkTjuZBNwW;WPx'Mn!QjNqCd:CvBjRtVT:UMhIhYto GlPdFi_QjNqCd x'cZhe MGpLzGM!NkTjuZBNwW:CvBjRtVT;WPx'Mn WPx'Mn QjNqCd_xkr:ZLVH/GlPdFi GlPdFi,QjNqCd IhCADUcFq MGpLzGM:IhCADUcFq.GVh/CvBjRtVT ZLVH_TdSRWTfm vBhpHTe?NkTjuZBNwW vBhpHTe TLfeKOGszj!LzBeegoBwq LzBeegoBwq!WPx'Mn:NkTjuZBNwW,WQoklhhc LzBeegoBwq QjNqCd xVsoUon;UMhIhYto xkr IhCADUcFq,mUUGfw UMhIhYto GlPdFi vBhpHTe/NkTjuZBNwW!GlPdFi WPx'Mn GlPdFi LzBeegoBwq vBhpHTe WPx'Mn/WPx'Mn_CvBjRtVT LzBeegoBwq LzBeegoBwq IhCADUcFq:UMhIhYto LzBeegoBwq xkr NkTjuZBNwW vBhpHTe_QjNqCd_x'cZhe WPx'Mn_mUUGfw;vBhpHTe.IhCADUcFq UMhIhYto!x'cZhe WPx'Mn IhCADUcFq!IhCADUcFq:QjNqCd,CvBjRtVT/CvBjRtVT TLfeKOGszj!xVsoUon?x'cZhe,QjNqCd?x'cZhe vBhpHTe x'cZhe-UMhIhYto!vBhpHTe WPx'Mn GlPdFi/LzBeegoBwq IhCADUcFq MGpLzGM,UMhIhYto IhCADUcFq x'cZhe;LzBeegoBwq_WPx'Mn!vBhpHTe GlPdFi/NkTjuZBNwW GVh,LzBeegoBwq UMhIhYto.xkr;mUUGfw IhCADUcFq;WPx'Mn NkTjuZBNwW QjNqCd/NkTjuZBNwW MGpLzGM vBhpHTe ZLVH;vBhpHTe:LzBeegoBwq GVh WQoklhhc IhCADUcFq UMhIhYto WQoklhhc:CvBjRtVT.ZLVH QjNqCd vBhpHTe.GlPdFi TLfeKOGszj GlPdFi xkr,QjNqCd mUUGfw-GlPdFi GlPdFi GlPdFi.TLfeKOGszj LzBeegoBwq WPx'Mn.LzBeegoBwq xkr MGpLzGM;GlPdFi,TLfeKOGszj IhCADUcFq xkr vBhpHTe UMhIhYto-IhCADUcFq QjNqCd GlPdFi TLfeKOGszj CvBjRtVT:WQoklhhc x'cZhe GlPdFi GlPdFi."));

	}
	
	/**

	 * Este método nos permite saber las palabras que más se repiten en un texto.
	 * @author Jerson Ramírez Ortiz
	 * @param  Cadena de texto especificando el texto a evaluar.
	 * @return Una lista con el top 3 de palabras más repetidas.

	 */
	public static List<String> top3(String s) {
		Map<String, Integer> topList = new TreeMap<>(), v;
		s = s.replaceAll("[\n]", " ").toLowerCase().replaceAll("[^a-z|']", " ").trim();
		if (s.length() == 0)return new ArrayList<>();
		String dat[] = s.split(" +");
		for (int i = 0; i < dat.length; i++) {
			if (dat[i].replaceAll("[^a-z]", "").trim().equals("")) {
				continue;
			}
			if (!topList.containsKey(dat[i])) {
				topList.put(dat[i], new Integer(1));
			} else {
				topList.replace(dat[i], topList.get(dat[i]) + 1);
			}
		}
		v = new TreeMap<>(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				int res = topList.get(o2).compareTo(topList.get(o1));
				return res != 0 ? res : 1;//Para preservar valores iguales
			}
		});

		Iterator<Entry<String, Integer>> it2 = topList.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<String, Integer> clave = it2.next();
			v.put(clave.getKey(), clave.getValue());
		}

		Iterator<Entry<String, Integer>> it = v.entrySet().iterator();
		List<String> rspt = new ArrayList<>();
		int co = 0;

		while (it.hasNext()) {
			if (co++ < 3) {
				Entry<String, Integer> clave = it.next();
				rspt.add(clave.getKey());
			} else {
				break;
			}
		}
		return rspt;
	}
	
	/*
	static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
		SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
				int res = e1.getValue().compareTo(e2.getValue());
				return res != 0 ? res : 1;
			}
		});
		sortedEntries.addAll(map.entrySet());
		return sortedEntries;
	}*/

}
