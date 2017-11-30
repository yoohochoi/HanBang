package hanbang.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import hanbang.domain.Review;
import hanbang.service.ReviewService;

//@MultipartConfig(maxFileSize=1024*1024*1024, location="C:/Users/limsuhyun/eclipse-workspace/HanBang/WebContent/file")
@Controller
public class ReviewController {
<<<<<<< HEAD
	
//	@Autowired
//	private ReviewService service;
//	
////	private AnswerService answerService;
//	
//	@RequestMapping("/review/registReview.do")
//	public String registerReview() {
//		return "registReview.jsp";
//	}
//	
//	// 후기 등록
//	@RequestMapping(value="/review/registReview.do", method=RequestMethod.POST)
//	public String registerReview(Review review, HttpSession session, @RequestParam("photo") MultipartFile file) {
//		File dir = null;
//		if (!file.isEmpty()) {
//			try {
//				byte[] bytes = file.getBytes();
//				dir = new File("c:\\" + File.separator + "tempFiles");
//
//				if (!dir.exists()) {
//					dir.mkdirs();
//				}
//
//				File saveFile = new File(dir.getAbsolutePath() + File.separator + file);
//				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
//				out.write(bytes);
//				out.close();
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
//		review.setPhoto(dir);
//		boolean registed = service.register(review);
//		if(!registed) {
//			return "redirect:registReview.do";
//		}
//		return "redirect:reviewDetail.do";
//	}
//	
//	// 후기 상세 조회
//	@RequestMapping("/review/detailReview.do")
//	public String detailReview(int reviewId, Model model) {
//		Review review = service.find(reviewId);
//		model.addAttribute(review);
//		return "reviewDetail.jsp";
//	}
//	
//	// 후기 수정
//	@RequestMapping("/review/modifyReview.do")
//	public String modifyReview(int reviewId, HttpSession session, Model model) {
//		String memberId = (String)session.getAttribute("loginedUser");
//		Review review = service.find(reviewId);
//		if(review.getWriterId().equals(memberId)) {
//			model.addAttribute(review);
//			return "modifyReview.jsp";
//		} else {
//			return "reviewDetail.do";
//		}
//	}
//	
//	//
//	@RequestMapping(value="/review/modifyReview.do", method=RequestMethod.POST)
//	public String modifyReview(Review review, Model model, MultipartFile file) {
//		service.modify(review);
//		model.addAttribute(review);
//		return "detailReview.do";
//	}
//	
//	// 후기 삭제(reviewId)
//	@RequestMapping("/review/removeReview.do")
//	public String removeReviewByReviewId(int reviewId) {
//		boolean check = service.removeByReviewId(reviewId);
//		if(check == false) {
//			return "redirect:reviewDetail.do";
//		} else {
//			return "redirect:reviewList.do";
//		}
//	}
//	
//	// 후기 삭제(memberId)
//		@RequestMapping("/review/removeReview.do")
//		public String removeReviewByMemberId(String memberId) {
//			boolean check = service.removeByMemberId(memberId);
//			if(check == false) {
//				return "redirect:reviewDetail.do";
//			} else {
//				return "redirect:reviewList.do";
//			}
//		}
//		
//		// 후기 삭제(shareHouseId)
//		@RequestMapping("/review/removeReview.do")
//		public String removeReviewShareHouseId(int shareHouseId) {
//			boolean check = service.removeByShareHouse(shareHouseId);
//			if(check == false) {
//				return "redirect:reviewDetail.do";
//			} else {
//				return "redirect:reviewList.do";
//			}
//		}
//	
//	// 후기 신고
//	@RequestMapping("/review/reportReview.do")
//	public String reportReview(HttpSession session, int reviewId) {
//		String memberId = (String)session.getAttribute("loginedUser");
//		service.reportReview(memberId, reviewId);
//		return "redirect:detailReview.do";
//	}
	
=======

	@Autowired
	private ReviewService service;

	@RequestMapping("/review/registReview.do")
	public String registerReview() {
		return "/views/reviewCreate_.jsp";
	}

	// 후기 등록
	@RequestMapping(value="/review/registReview.do", method=RequestMethod.POST)
	public String registerReview(String title, String content, HttpSession session, @RequestParam("file") MultipartFile file) {
		File dir = null;
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				dir = new File("c:\\" + File.separator + "tempFiles");

				if (!dir.exists()) {
					dir.mkdirs();
				}

				File saveFile = new File(dir.getAbsolutePath() + File.separator + file);
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
				out.write(bytes);
				out.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Review review = new Review();
		review.setContent(content);
		review.setTitle(title);
		review.setWriterId("ms");
		review.setShareHouseId(1);
//		review.setPhoto(dir);
		boolean registed = service.register(review);
		if (!registed) {
			return "redirect:/review/registReview.do";
		}
		return "redirect:/views/reviewDetail.jsp";
	}
	
//	// 달달 사진 올리기
//	private String getPhotoFile1(Part part) {
//		String photoFile1 = null;
//		String contentDispositionHeader = part.getHeader("content-disposition");
//		String[] elements = contentDispositionHeader.split(";");
//		for (String element : elements) {
//			photoFile1 = element.substring(element.indexOf('=')+ 1);
//			photoFile1 = photoFile1.trim().replace("\"","");
//		}
//		return photoFile1;
//
//	}

	// 후기 상세 조회
	@RequestMapping("/review/detailReview.do")
	public String detailReview(int reviewId, Model model) {
		Review review = service.find(reviewId);
		model.addAttribute(review);
		return "reviewDetail.jsp";
	}

	// 후기 수정
	@RequestMapping("/review/modifyReview.do")
	public String modifyReview(int reviewId, HttpSession session, Model model) {
		String memberId = (String) session.getAttribute("loginedUser");
		Review review = service.find(reviewId);
		if (review.getWriterId().equals(memberId)) {
			model.addAttribute(review);
			return "modifyReview.jsp";
		} else {
			return "reviewDetail.do";
		}
	}

	//
	@RequestMapping(value = "/review/modifyReview.do", method = RequestMethod.POST)
	public String modifyReview(Review review, Model model, MultipartFile file) {
		service.modify(review);
		model.addAttribute(review);
		return "detailReview.do";
	}

	// 후기 삭제(reviewId)
	@RequestMapping("/review/removeReviewByReviewId.do")
	public String removeReviewByReviewId(int reviewId) {
		boolean check = service.removeByReviewId(reviewId);
		if (check == false) {
			return "redirect:reviewDetail.do";
		} else {
			return "redirect:reviewList.do";
		}
	}

	// 후기 삭제(memberId)
	@RequestMapping("/review/removeReviewByMemberId.do")
	public String removeReviewByMemberId(String memberId) {
		boolean check = service.removeByMemberId(memberId);
		if (check == false) {
			return "redirect:reviewDetail.do";
		} else {
			return "redirect:reviewList.do";
		}
	}

	// 후기 삭제(shareHouseId)
	@RequestMapping("/review/removeReviewByShareHouseId.do")
	public String removeReviewShareHouseId(int shareHouseId) {
		boolean check = service.removeByShareHouse(shareHouseId);
		if (check == false) {
			return "redirect:reviewDetail.do";
		} else {
			return "redirect:reviewList.do";
		}
	}

	// 후기 신고
	@RequestMapping("/review/reportReview.do")
	public String reportReview(HttpSession session, int reviewId) {
		String memberId = (String) session.getAttribute("loginedUser");
		service.reportReview(memberId, reviewId);
		return "redirect:detailReview.do";
	}

>>>>>>> refs/remotes/origin/suhyun
}
