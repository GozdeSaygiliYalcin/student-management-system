package com.bilgeadam.lesson029;

public class InternationalSmallTalk {

	public static void main(String[] args) {
		
		if (args.length > 1) {
			Messages.setLocale(args[0], args[1]);
//			for (String arg : args) {
//				System.out.println(arg);
//			}
		} else if (args.length > 0) {
			Messages.setLocale(args[0]);
		}
		
		System.out.println(Messages.getString("InternationalSmallTalk.HELLO")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.SPLITTER")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.THANKS")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.QUESTION")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.SPLITTER")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.ANSWER")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalSmallTalk.BYE")); //$NON-NLS-1$
	}
}
